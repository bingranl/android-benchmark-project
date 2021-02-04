package com.android.example.module02_module37_module05_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module02_module37_module05_module3.ClassAAG = com.android.example.module02_module37_module05_module3.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module02_module37_module05_module3.ClassAAG = com.android.example.module02_module37_module05_module3.ClassAAG()

	fun method0(
		param0: com.android.example.module02_module37_module05_module3.ClassAAE,
		param1: com.android.example.module02_module37_module05_module3.ClassAAA,
		param2: com.android.example.module02_module37_module05_module3.ClassAAD
	) {
		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.dispose()

		}
	}

	fun method1(
		param0: com.android.example.module02_module37_module05_module3.ClassAAB,
		param1: com.android.example.module02_module37_module05_module3.ClassAAH,
		param2: com.android.example.module02_module37_module05_module3.ClassAAA,
		param3: com.android.example.module02_module37_module05_module3.ClassAAG
	) {
		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.triggerActions()

		param0.method0("SomeString", "SomeString", "SomeString")

		param0.method1("SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module02_module37_module05_module3.ClassAAH
	) {
		val local_var_2_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_1.createWorker()

	}

	fun method3(
		param0: com.android.example.module02_module37_module05_module3.ClassAAB
	) {
		val local_var_2_1: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_1.dispose()

	}
}
