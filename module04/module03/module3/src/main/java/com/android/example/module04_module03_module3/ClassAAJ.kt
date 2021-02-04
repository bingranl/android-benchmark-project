package com.android.example.module04_module03_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module04_module12_module6.ClassAAH = com.android.example.module04_module12_module6.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module04_module12_module6.ClassAAA = com.android.example.module04_module12_module6.ClassAAA()

	fun method0(
		param0: com.android.example.module04_module12_module6.ClassAAE,
		param1: com.android.example.module04_module12_module6.ClassAAA,
		param2: com.android.example.module04_module12_module6.ClassAAH,
		param3: com.android.example.module04_module12_module6.ClassAAH
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.isDisposed()

	}

	fun method1(
		param0: com.android.example.module04_module12_module6.ClassAAA,
		param1: com.android.example.module04_module12_module6.ClassAAD
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..0) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onNext(kotlin.Any())

				val local_var_4_1: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(25)
				local_var_4_1.add(kotlin.Any())

			}
		} else {
			val local_var_3_0: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
			local_var_3_0.shutdown()

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

	}

	fun method2(
		param0: com.android.example.module04_module12_module6.ClassAAF,
		param1: com.android.example.module04_module12_module6.ClassAAI,
		param2: com.android.example.module04_module12_module6.ClassAAF
	) {
		val local_var_2_3: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_3.get()

		param0.method0("SomeString", "SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module04_module12_module6.ClassAAG
	) {
		param0.method2("SomeString", "SomeString", "SomeString")

	}

	fun method4(
		param0: com.android.example.module04_module12_module6.ClassAAC
	) {
		param0.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isCancelled()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}
}
