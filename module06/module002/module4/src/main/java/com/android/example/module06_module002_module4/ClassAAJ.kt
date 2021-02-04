package com.android.example.module06_module002_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module002_module5.ClassAAC = com.android.example.module06_module002_module5.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module002_module1.ClassAAD = com.android.example.module06_module002_module1.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module002_module5.ClassAAH = com.android.example.module06_module002_module5.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module06_module002_module1.ClassAAC = com.android.example.module06_module002_module1.ClassAAC()
	private 	val instance_var_1_4: com.android.example.module06_module002_module1.ClassAAD = com.android.example.module06_module002_module1.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module002_module5.ClassAAE
	) {
		param0.method0(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

		for (iAb in 0..3) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.hasSubscription()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.cancel()

			val local_var_3_2: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
			local_var_3_2.cancel()

			local_var_3_0.isCancelled()

		}
	}

	fun method1(
		param0: com.android.example.module06_module002_module5.ClassAAH,
		param1: com.android.example.module06_module002_module1.ClassAAH,
		param2: com.android.example.module06_module002_module1.ClassAAH,
		param3: com.android.example.module06_module002_module5.ClassAAB
	) {
		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 32)

		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.isCancelled()

	}

	fun method2(
		param0: com.android.example.module06_module002_module5.ClassAAB,
		param1: com.android.example.module06_module002_module5.ClassAAF
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

	}

	fun method3(
		param0: com.android.example.module06_module002_module5.ClassAAC,
		param1: com.android.example.module06_module002_module5.ClassAAG,
		param2: com.android.example.module06_module002_module5.ClassAAC
	) {
	}
}
