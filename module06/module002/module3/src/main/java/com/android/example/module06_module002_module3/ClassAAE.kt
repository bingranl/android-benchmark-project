package com.android.example.module06_module002_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module002_module5.ClassAAJ = com.android.example.module06_module002_module5.ClassAAJ()
	private 	val instance_var_1_1: com.android.example.module06_module002_module5.ClassAAF = com.android.example.module06_module002_module5.ClassAAF()
	private 	val instance_var_1_2: com.android.example.module06_module002_module2.ClassAAI = com.android.example.module06_module002_module2.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module06_module002_module5.ClassAAC = com.android.example.module06_module002_module5.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module002_module5.ClassAAH,
		param1: com.android.example.module06_module002_module5.ClassAAA
	) {
		for (iAb in 0..1) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.requestMore(-2225562502068388493)

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.dispose()

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.isDisposed()

		}
		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory())

		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory())

	}

	fun method1(
		param0: com.android.example.module06_module002_module5.ClassAAA,
		param1: com.android.example.module06_module002_module2.ClassAAC,
		param2: com.android.example.module06_module002_module5.ClassAAE,
		param3: com.android.example.module06_module002_module5.ClassAAF
	) {
		param0.method0(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

	}

	fun method2(
		param0: com.android.example.module06_module002_module5.ClassAAH,
		param1: com.android.example.module06_module002_module2.ClassAAC
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

	}
}
