package com.android.example.module02_module37_module02_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module02_module37_module02_module1.ClassAAE = com.android.example.module02_module37_module02_module1.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module02_module37_module02_module3.ClassAAI = com.android.example.module02_module37_module02_module3.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module02_module37_module02_module1.ClassAAH = com.android.example.module02_module37_module02_module1.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module02_module37_module02_module1.ClassAAA = com.android.example.module02_module37_module02_module1.ClassAAA()

	fun method0(
		param0: com.android.example.module02_module37_module02_module1.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.clear()

		}
		for (iAb in 0..5) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.isCancelled()

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.dispose()

		}
	}

	fun method1(
		param0: com.android.example.module02_module37_module02_module1.ClassAAB
	) {
	}

	fun method2(
		param0: com.android.example.module02_module37_module02_module3.ClassAAH,
		param1: com.android.example.module02_module37_module02_module1.ClassAAF
	) {
		param0.method4("SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module02_module37_module02_module3.ClassAAE,
		param1: com.android.example.module02_module37_module02_module3.ClassAAA,
		param2: com.android.example.module02_module37_module02_module3.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

	}

	fun method4(
		param0: com.android.example.module02_module37_module02_module1.ClassAAA
	) {
	}
}
